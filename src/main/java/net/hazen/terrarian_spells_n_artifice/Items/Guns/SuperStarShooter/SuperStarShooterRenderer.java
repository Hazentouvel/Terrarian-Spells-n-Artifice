package net.hazen.terrarian_spells_n_artifice.Items.Guns.SuperStarShooter;

import io.redspace.irons_artifice.client.gun.GunInHandRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class SuperStarShooterRenderer extends GunInHandRenderer {
    public SuperStarShooterRenderer() {
        super(new SuperStarShooterModel());
        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
