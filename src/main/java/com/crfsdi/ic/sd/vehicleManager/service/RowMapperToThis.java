package com.crfsdi.ic.sd.vehicleManager.service;

import org.springframework.jdbc.core.RowMapper;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMapperToThis<T> extends RowMapper {

    @Override
    default T mapRow(ResultSet rs, int rowNum) throws SQLException {
        Class objClass = this.getClass();
        T t = null;
        try {
            t = (T) objClass.getConstructor(null).newInstance(null);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        Field[] fields = this.getClass().getFields();
        for (Field field : fields) {
            try {
                field.set(t, rs.getString(field.getName()));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return t;
    }
}
