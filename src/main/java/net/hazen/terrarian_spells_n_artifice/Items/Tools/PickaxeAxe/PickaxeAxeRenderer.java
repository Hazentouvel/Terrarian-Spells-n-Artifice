package net.hazen.terrarian_spells_n_artifice.Items.Tools.PickaxeAxe;

import software.bernie.geckolib.renderer.GeoItemRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class PickaxeAxeRenderer extends GeoItemRenderer<PickaxeAxeItem> {
    public PickaxeAxeRenderer() {
        super(new PickaxeAxeModel());
        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
