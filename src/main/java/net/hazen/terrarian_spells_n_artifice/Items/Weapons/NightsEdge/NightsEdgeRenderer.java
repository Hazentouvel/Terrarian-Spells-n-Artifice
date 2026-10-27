package net.hazen.terrarian_spells_n_artifice.Items.Weapons.NightsEdge;

import software.bernie.geckolib.renderer.GeoItemRenderer;

public class NightsEdgeRenderer extends GeoItemRenderer<NightsEdgeItem> {
    public NightsEdgeRenderer() {
        super(new NightsEdgeModel());
        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
