package org.springframework.roo.addon.russian;

import java.io.InputStream;
import java.util.Locale;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.springframework.roo.addon.web.mvc.jsp.i18n.AbstractLanguage;
import org.springframework.roo.support.util.FileUtils;

/** 
 * Russian language support.
 *
 */
@Component(immediate = true)
@Service
public class RussianLanguage extends AbstractLanguage {

    public Locale getLocale() {
        return new Locale("ru");
    }
    
    public String getLanguage() {
        return "Russian";
    }

    public InputStream getFlagGraphic() {
        return FileUtils.getInputStream(getClass(), "ru.png");
    }

    public InputStream getMessageBundle() {
        return FileUtils.getInputStream(getClass(), "messages_ru.properties");
    }
}
