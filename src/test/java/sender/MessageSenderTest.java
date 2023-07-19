package sender;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;
import ru.netology.sender.MessageSender;

import java.util.Map;

public class MessageSenderTest {

    @Test
    void testLocation(){

        LocalizationServiceMock localizationServiceMock = new LocalizationServiceMock();
        localizationServiceMock.setValue();

        GeoServiceMock geoServiceMock = new GeoServiceMock();
        geoServiceMock.setValue();




    }
}
