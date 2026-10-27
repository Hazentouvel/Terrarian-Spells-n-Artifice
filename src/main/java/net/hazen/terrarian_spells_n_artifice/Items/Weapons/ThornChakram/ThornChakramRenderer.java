package net.hazen.terrarian_spells_n_artifice.Items.Weapons.ThornChakram;

import software.bernie.geckolib.renderer.GeoItemRenderer;

public class ThornChakramRenderer extends GeoItemRenderer<ThornChakramItem> {
    public ThornChakramRenderer() {
        super(new ThornChakramModel());
        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
