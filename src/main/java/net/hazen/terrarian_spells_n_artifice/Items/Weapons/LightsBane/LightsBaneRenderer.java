package net.hazen.terrarian_spells_n_artifice.Items.Weapons.LightsBane;

import software.bernie.geckolib.renderer.GeoItemRenderer;

public class LightsBaneRenderer extends GeoItemRenderer<LightsBaneItem> {
    public LightsBaneRenderer() {
        super(new LightsBaneModel());
        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
