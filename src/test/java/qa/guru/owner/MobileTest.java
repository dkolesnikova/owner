package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.owner.config.MobileConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class MobileTest {

    @Test
    public void testMobile() {
        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());

        assertThat(config.getDeviceName()).isEqualTo("iPhone 13 Pro Max");
        assertThat(config.getPlatformName()).isEqualTo("IOS");
        assertThat(config.getPlatformVersion()).isEqualTo("13");
    }

    @Test
    public void testMobileWithSystemOverride() {
        System.setProperty("platform.version", "12");

        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());

        assertThat(config.getPlatformVersion()).isEqualTo("12");
    }
}
