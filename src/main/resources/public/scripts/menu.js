angular.module('menuApp', ['rzModule', 'moment-picker'])
.controller('MenuController', function($scope, $http) {
    var menuController = this;

    $http.get('/menu/list')
        .then(function(response){
            $scope.initialize(response.data.list);
        }
    );

    $scope.initialize = function(menus) {
        menuController.data = {};
        menuController.data.days = ["Lunes",
        "Martes",
        "Miercoles",
        "Jueves",
        "Viernes",
        "Sábado",
        "Domingo"];
        menuController.data.menus = menus;
        console.log(menuController.data.menus);
        menuController.getMaxPrice = function() {
          var max = 0;
          $.each(menuController.data.menus, function() {
              var menu = this;
              if (menu.price > max) {
                max = menu.price;
              }
          });
          return max;
        };
        var maxPrice = menuController.getMaxPrice();

        menuController.filters = {};
        menuController.filters.price = {
            min: 0,
            max: maxPrice,
            options: {
                floor: 0,
                ceil: maxPrice
            }
        };

        menuController.filterMenus = function() {
            $.each(menuController.data.menus, function() {
                var menu = this;
                menu.visible = true;
                if ($.inArray("-1", menuController.filters.day) < 0) {
                    $.each(menuController.filters.day, function() {
                        var day = this;
                        menu.visible &= $.inArray(parseInt(day), menu.days) > -1;
                    });
                }

                menu.visible &= (
                    menu.price >= menuController.filters.price.min
                    && menu.price <= menuController.filters.price.max
                );

                if (!($scope.isEmpty(menuController.filters.dateFrom)
                    || $scope.isEmpty(menuController.filters.dateTo))) {
                    var dateFrom = new moment(menuController.filters.dateFrom, 'DD/MM/YYYY'),
                        dateTo = new moment(menuController.filters.dateTo, 'DD/MM/YYYY'),
                        validFrom = new moment(menu.validFrom, 'YYYY-MM-DD'),
                        validTo = new moment(menu.validTo, 'YYYY-MM-DD');
                    menu.visible &= validFrom >= dateFrom && validTo <= dateTo;
                }

                if (!($scope.isEmpty(menuController.filters.timeFrom)
                    || $scope.isEmpty(menuController.filters.timeTo))) {
                    var timeFrom = new moment(menuController.filters.timeFrom, 'HH:mm'),
                        timeTo = new moment(menuController.filters.timeTo, 'HH:mm'),
                        validFrom = new moment(menu.timeFrom, 'HH:mm'),
                        validTo = new moment(menu.timeTo, 'HH:mm');
                    menu.visible &= validFrom >= timeFrom && validTo <= timeTo;
                }
            });
        };

        menuController.showDetails = function(menu) {
          menu.detailsVisible = !menu.detailsVisible;
        };

        menuController.delete = function(menu) {
          $('#underConstructionModal').modal();
        };

        menuController.edit = function(menu) {
          $('#underConstructionModal').modal();
        };

        $scope.$watch('menuController.filters', function(oldVal, newVal) {
            menuController.filterMenus();
        }, true);
    }

    $scope.formatDate = function(date, format) {
        return moment(date).format(format);
    };

    $scope.formatDays = function(days) {
        var formatted = [];
        $.each(days, function() {
            formatted.push(menuController.data.days[this]);
        });
        return formatted.join(", ");
    };

    $scope.isEmpty = function(value) {
        return (typeof value == typeof undefined) || (value == null || value == '');
    };
});
