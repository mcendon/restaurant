package io.github.mcendon.restaurant.menubackend.mocks;

import io.github.mcendon.restaurant.menubackend.model.MenuModel;
import java.util.ArrayList;
import java.util.Arrays;

public class MenuListMock extends ArrayList<MenuModel> {
    public MenuListMock() {
        add(new MenuModel()
                    .setName("Pollo al horno con papas a la provenzal")
                    .setDescription("Pollo horneado al horno con finas papas a la provenzal.")
                    .setPrice(80)
                    .setCurrency("ARS$")
                    .setPhoto("images/menu-0.jpg")
                    .setDays(Arrays.asList(new Integer[]{0, 1, 2, 3, 4}))
                    .setValidFrom("2016-11-01")
                    .setValidTo("2016-11-30")
                    .setTimeFrom("13:00")
                    .setTimeTo("15:00")
                    .setStars(4)

            );
            add(new MenuModel()
                    .setName("Milanesa a la mostaza con papas")
                    .setDescription("Milanesa a la mostaza con papas. Opciones de papas: A la española, fritas o al horno.")
                    .setPrice(80)
                    .setCurrency("ARS$")
                    .setPhoto("images/menu-1.jpg")
                    .setDays(Arrays.asList(new Integer[]{5, 6}))
                    .setValidFrom("2016-11-01")
                    .setValidTo("2016-11-15")
                    .setTimeFrom("12:00")
                    .setTimeTo("14:00")
                    .setStars(5)

            );
            add(new MenuModel()
                    .setName("Ravioles con salsa")
                    .setDescription("Ravioles con salsa. Opciones de salsa: Blanca, rosa, filetto, bolognesa")
                    .setPrice(130)
                    .setCurrency("ARS$")
                    .setPhoto("images/menu-2.jpg")
                    .setDays(Arrays.asList(new Integer[]{0, 2, 4}))
                    .setValidFrom("2016-12-01")
                    .setValidTo("2016-12-15")
                    .setTimeFrom("12:00")
                    .setTimeTo("14:00")
                    .setStars(2)

            );
            add(new MenuModel()
                    .setName("Sushi - 20 piezas a elección")
                    .setDescription("Sushi 20 piezas a elección - NY Phila, Roll Napoli, Roll BsAs, Tora, Sashimi, Geishas.")
                    .setPrice(210)
                    .setCurrency("ARS$")
                    .setPhoto("images/menu-3.jpg")
                    .setDays(Arrays.asList(new Integer[]{5, 6, 0}))
                    .setValidFrom("2016-12-01")
                    .setValidTo("2016-12-30")
                    .setTimeFrom("11:00")
                    .setTimeTo("15:00")
                    .setStars(5)
            );
    }
}
