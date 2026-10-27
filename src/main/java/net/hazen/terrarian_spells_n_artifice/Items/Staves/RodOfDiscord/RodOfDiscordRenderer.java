package net.hazen.terrarian_spells_n_artifice.Items.Staves.RodOfDiscord;

import software.bernie.geckolib.renderer.GeoItemRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class RodOfDiscordRenderer extends GeoItemRenderer<RodOfDiscord> {
    public RodOfDiscordRenderer() {
        super(new RodOfDiscordModel());
        //addRenderLayer(new AutoGlowingGeoLayer<>(this));

        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
