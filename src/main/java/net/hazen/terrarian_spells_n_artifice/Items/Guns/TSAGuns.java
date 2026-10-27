package net.hazen.terrarian_spells_n_artifice.Items.Guns;

import io.redspace.irons_artifice.client.sounds.GunShotSoundSettings;
import io.redspace.irons_artifice.data.*;
import io.redspace.irons_artifice.gun.ArmPoseKind;
import io.redspace.irons_artifice.gun.GunProfile;
import io.redspace.irons_artifice.registry.SoundRegistry;
import net.hazen.terrarian_spells_n_artifice.Registries.TSASoundRegistry;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;

public class TSAGuns {

    public static final GunProfile STAR_CANNON = GunProfile.builder(
                    16,
                    6,
                    25,
                    FireMode.AUTO,
                    ArmPoseKind.RIFLE,
                    ShotComponentTemplate.builder(11, 2, 0.1, 5, RecoilProfile.of(7.5f, .35f, 0.6f, 6969))
                            .projectileCount(1)
                            .gunshotSound(
                                    GunShotSoundSettings.standardShot((Holder<SoundEvent>) TSASoundRegistry.STAR_FIRE, 1f),
                                    GunShotSoundSettings.standardEcho((Holder<SoundEvent>) TSASoundRegistry.STAR_FIRE, 1f),
                                    PlayableSound.of(PlayableSound.holder(TSASoundRegistry.STAR_FAIL.get()), 0.75f, 1f, 1.1f))
                            .muzzleFlash(MuzzleFlashType.TRIANGLE)
                            .modify(map -> map.getOrCreate(ShotComponents.IMPACT_SOUND)
                                    .addBlockAccent(PlayableSound.of((Holder<SoundEvent>) TSASoundRegistry.STAR_IMPACT, 2f, 0.9f, 1.1f)))
                            .build())

            .reloadCues(ReloadCueStack.of(
                    new ReloadCue(0.5f, PlayableSound.of((Holder<SoundEvent>) TSASoundRegistry.STAR_CANNON_RELOAD, 1.25f, 0.9f, 1.1f)),
                    new ReloadCue(0.88f, PlayableSound.of((Holder<SoundEvent>) TSASoundRegistry.STAR_CANNON_RELOAD, 1.25f, 0.9f, 1.1f))
            ))
            .equipSound(PlayableSound.of(
                    SoundRegistry.CLOCKWORK_RIFLE_EQUIP,
                    0.75f, 0.9f, 1.1f
            ))
            .build();

    public static final GunProfile SUPER_STAR_SHOOTER = GunProfile.builder(
                    24,
                    7,
                    60,
                    FireMode.AUTO,
                    ArmPoseKind.RIFLE,
                    ShotComponentTemplate.builder(14, 2, 0.15, 6, RecoilProfile.of(7.5f, .35f, 0.6f, 6969))
                            .projectileCount(1)
                            .gunshotSound(
                                    GunShotSoundSettings.standardShot((Holder<SoundEvent>) TSASoundRegistry.STAR_FIRE, 1f),
                                    GunShotSoundSettings.standardEcho((Holder<SoundEvent>) TSASoundRegistry.STAR_FIRE, 1f),
                                    PlayableSound.of(PlayableSound.holder(TSASoundRegistry.STAR_FAIL.get()), 0.75f, 1f, 1.1f))
                            .modify(map -> map.getOrCreate(ShotComponents.IMPACT_SOUND)
                                    .addBlockAccent(PlayableSound.of((Holder<SoundEvent>) TSASoundRegistry.STAR_IMPACT, 2f, 0.9f, 1.1f)))
                            .muzzleFlash(MuzzleFlashType.TRIANGLE)
                            .build())
            .reloadCues(ReloadCueStack.of(
                    new ReloadCue(1f, PlayableSound.of((Holder<SoundEvent>) TSASoundRegistry.SUPER_STAR_SHOOTER_RELOAD, 1.25f, 0.9f, 1.1f)),
                    new ReloadCue(1.63f, PlayableSound.of((Holder<SoundEvent>) TSASoundRegistry.STAR_CANNON_RELOAD, 1.25f, 0.9f, 1.1f))
            ))
            .equipSound(PlayableSound.of(
                    SoundRegistry.CLOCKWORK_RIFLE_EQUIP,
                    0.75f, 0.9f, 1.1f
            ))
            .build();

}
