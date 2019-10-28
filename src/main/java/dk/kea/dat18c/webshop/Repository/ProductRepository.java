package dk.kea.dat18c.webshop.Repository;

import dk.kea.dat18c.webshop.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class ProductRepository {

    @Autowired
    JdbcTemplate template;

    public List<Product> getAll() {

        /**
         * her hentes bookings fra databasen
         */

        String sql = "SELECT * FROM products";
        /**
         * rowmapper mapper rækker i sql-query'en til en liste af Booking
         */

        RowMapper<Product> rowMapper = new BeanPropertyRowMapper<>(Product.class);
        /**
         * udfør sql query
         */

        return template.query(sql, rowMapper);
    }
}
