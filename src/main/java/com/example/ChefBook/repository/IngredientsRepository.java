package com.example.ChefBook.repository;
import com.example.ChefBook.entity.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IngredientsRepository extends JpaRepository<Ingredients, Long> {

    List<Ingredients> findByIngredientName(String ingredientName);

//    @Query ("SELECT b FROM Ingredients b WHERE b.ingredientName LIKE %:keyword%")
//    List<Ingredients> searchByKeyword(@Param("keyword") String keyword);
}



