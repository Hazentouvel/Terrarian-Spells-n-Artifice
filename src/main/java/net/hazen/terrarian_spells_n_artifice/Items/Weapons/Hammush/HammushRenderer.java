package net.hazen.terrarian_spells_n_artifice.Items.Weapons.Hammush;

import software.bernie.geckolib.renderer.GeoItemRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class HammushRenderer extends GeoItemRenderer<HammushItem> {
    public HammushRenderer() {
        super(new HammushModel());
        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
