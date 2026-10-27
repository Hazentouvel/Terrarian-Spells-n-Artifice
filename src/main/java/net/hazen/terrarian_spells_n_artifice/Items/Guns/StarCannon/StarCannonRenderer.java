package net.hazen.terrarian_spells_n_artifice.Items.Guns.StarCannon;

import io.redspace.irons_artifice.client.gun.GunInHandRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class StarCannonRenderer extends GunInHandRenderer {
    public StarCannonRenderer() {
        super(new StarCannonModel());
        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
