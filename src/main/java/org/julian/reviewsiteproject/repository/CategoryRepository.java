package org.julian.reviewsiteproject.repository;

import org.julian.reviewsiteproject.entities.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>
{

}
