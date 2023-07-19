package sender;

import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;

public class LocalizationServiceMock implements LocalizationService {

    private LocalizationService value;

    @Override
    public String locale(Country country) {
        return String.valueOf(value);
    }

   public void setValue(LocalizationService value) {
       this.value = value;
   }
}
