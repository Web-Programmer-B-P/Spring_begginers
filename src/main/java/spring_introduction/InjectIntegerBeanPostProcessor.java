package spring_introduction;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;

@Component
public class InjectIntegerBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(RandomIntegerValue.class)) {
                field.setAccessible(true);
                RandomIntegerValue annotation = field.getAnnotation(RandomIntegerValue.class);
                ReflectionUtils.setField(field, bean, getRandomIntInRange(annotation.min(), annotation.max()));
            }
        }

        return bean;
    }

    private int getRandomIntInRange(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
