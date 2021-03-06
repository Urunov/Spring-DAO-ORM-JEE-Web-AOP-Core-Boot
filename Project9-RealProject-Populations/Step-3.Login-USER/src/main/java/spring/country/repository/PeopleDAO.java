package spring.country.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import spring.country.model.People;

import java.util.List;

/**
 * @Created 12 / 06 / 2020 - 5:13 PM
 * @project SpringBootPeople
 * @Author Hamdamboy
 */

public interface PeopleDAO extends JpaRepository<People, Integer> {


    @Query("SELECT p FROM People p WHERE CONCAT(p.Name, ' ', p.birthdate, ' ', p.FamilyName, ' ', p.Education, ' ', p.Address, ' ', p.marriage) LIKE %?1%")
    List<People> search(String keyword);
}
