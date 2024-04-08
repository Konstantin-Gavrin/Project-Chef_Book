package com.example.ChefBook.repository;
import com.example.ChefBook.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    List<Recipe> findByTitle (String title);

    List<Recipe> findByDescription (String description);

    List<Recipe> findByInstructions (String instructions);

    List<Recipe> findByTotalTime (int totalTime);

    List<Recipe> findByServings (int servings);

    List<Recipe> findByCategories (String categories);

    @Query ("SELECT b FROM Recipe b WHERE b.title LIKE %:keyword%")
    List<Recipe> searchByKeyword(@Param("keyword") String keyword);
}
