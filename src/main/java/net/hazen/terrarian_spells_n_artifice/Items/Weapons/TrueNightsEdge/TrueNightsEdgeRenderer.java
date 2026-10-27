package net.hazen.terrarian_spells_n_artifice.Items.Weapons.TrueNightsEdge;

import software.bernie.geckolib.renderer.GeoItemRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class TrueNightsEdgeRenderer extends GeoItemRenderer<TrueNightsEdgeItem> {
    public TrueNightsEdgeRenderer() {
        super(new TrueNightsEdgeModel());
        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
