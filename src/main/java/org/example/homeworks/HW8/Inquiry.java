package org.example.homeworks.HW8;

public class Inquiry {
    public static void main(String[] args) {
        // Массивы параметров и значений
        String[] keys = {"model", "country", "city", "year", "active"};
        Object[] values = {"V-60", "Germany", "Berlin", null, true};

        // Создаем SQL-запрос
        String query = buildSQLQuery(keys, values);
        System.out.println(query);
    }

    // Функция для создания SQL-запроса
    public static String buildSQLQuery(String[] keys, Object[] values) {
        StringBuilder query = new StringBuilder("SELECT * FROM users WHERE id = '1'  AND city = 'Helsilnki");

        boolean isFirstCondition = true;

        // Проходим по всем параметрам и значениям
        for (int i = 0; i < keys.length; i++) {
            String key = keys[i];
            Object value = values[i];
            // Если значение не null, добавляем его в запрос
            if (value != null) {
                if (!isFirstCondition) {
                    query.append(" AND ");
                }

                if (value instanceof String || value instanceof Boolean) {
                    query.append(key).append(" = '").append(value).append("'");
                } else {
                    query.append(key).append(" = ").append(value);
                }

                isFirstCondition = false;
            }
        }

        return query.toString();
    }
}

