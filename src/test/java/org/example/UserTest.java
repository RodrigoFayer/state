package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserTest {
    User user;

    @BeforeEach
    public void setUp() {
        user = new User();
    }

//    legacy
    @Test
    public void shouldNotSwapLegacyToLegacy() {
        user.setState(UserStateLegacy.getInstance());
        assertFalse(user.canSwapToLegacy());
    }

    @Test
    public void shouldNotSwapLegacyToStarter() {
        user.setState(UserStateLegacy.getInstance());
        assertFalse(user.canSwapToStarter());
    }

    @Test
    public void shouldNotSwapLegacyToPro() {
        user.setState(UserStateLegacy.getInstance());
        assertFalse(user.canSwapToPro());
    }

    @Test
    public void shouldNotSwapLegacyToPremium() {
        user.setState(UserStateLegacy.getInstance());
        assertFalse(user.canSwapToPremium());
    }

    @Test
    public void shouldNotSwapLegacyToEnterprise() {
        user.setState(UserStateLegacy.getInstance());
        assertFalse(user.canSwapToEnterprise());
    }

//    Starter

    @Test
    public void shouldNotSwapStarterToStarter() {
        user.setState(UserStateStarter.getInstance());
        assertFalse(user.canSwapToStarter());
    }

    @Test
    public void shouldNotSwapStarterToLegacy() {
        user.setState(UserStateStarter.getInstance());
        assertFalse(user.canSwapToLegacy());
    }

    @Test
    public void shouldSwapStarterToPro() {
        user.setState(UserStateStarter.getInstance());
        assertTrue(user.canSwapToPro());
    }

    @Test
    public void shouldSwapStarterToPremium() {
        user.setState(UserStateStarter.getInstance());
        assertTrue(user.canSwapToPremium());
    }

    @Test
    public void shouldNotSwapStarterToEnterprise() {
        user.setState(UserStateStarter.getInstance());
        assertFalse(user.canSwapToEnterprise());
    }

//    Pro

    @Test
    public void shouldNotSwapProToPro() {
        user.setState(UserStatePro.getInstance());
        assertFalse(user.canSwapToPro());
    }

    @Test
    public void shouldNotSwapProToLegacy() {
        user.setState(UserStatePro.getInstance());
        assertFalse(user.canSwapToLegacy());
    }

    @Test
    public void shouldSwapProToStarter() {
        user.setState(UserStatePro.getInstance());
        assertTrue(user.canSwapToStarter());
    }

    @Test
    public void shouldSwapProToPremium() {
        user.setState(UserStatePro.getInstance());
        assertTrue(user.canSwapToPremium());
    }

    @Test
    public void shouldNotSwapProToEnterprise() {
        user.setState(UserStatePro.getInstance());
        assertFalse(user.canSwapToEnterprise());
    }

//    Premium

    @Test
    public void shouldNotSwapPremiumToPremium() {
        user.setState(UserStatePremium.getInstance());
        assertFalse(user.canSwapToPremium());
    }

    @Test
    public void shouldNotSwapPremiumToLegacy() {
        user.setState(UserStatePremium.getInstance());
        assertFalse(user.canSwapToLegacy());
    }

    @Test
    public void shouldSwapPremiumToStarter() {
        user.setState(UserStatePremium.getInstance());
        assertTrue(user.canSwapToStarter());
    }

    @Test
    public void shouldSwapPremiumToPro() {
        user.setState(UserStatePremium.getInstance());
        assertTrue(user.canSwapToPro());
    }

    @Test
    public void shouldNotSwapPremiumToEnterprise() {
        user.setState(UserStatePremium.getInstance());
        assertFalse(user.canSwapToEnterprise());
    }

//  Enterprise

    @Test
    public void shouldNotSwapEnterpriseToEnterprise() {
        user.setState(UserStateEnterprise.getInstance());
        assertFalse(user.canSwapToEnterprise());
    }

    @Test
    public void shouldSwapEnterpriseToLegacy() {
        user.setState(UserStateEnterprise.getInstance());
        assertTrue(user.canSwapToLegacy());
    }

    @Test
    public void shouldNotSwapEnterpriseToStarter() {
        user.setState(UserStateEnterprise.getInstance());
        assertFalse(user.canSwapToStarter());
    }

    @Test
    public void shouldNotSwapEnterpriseToPro() {
        user.setState(UserStateEnterprise.getInstance());
        assertFalse(user.canSwapToPro());
    }

    @Test
    public void shouldNotSwapEnterpriseToPremium() {
        user.setState(UserStateEnterprise.getInstance());
        assertFalse(user.canSwapToPremium());
    }
}