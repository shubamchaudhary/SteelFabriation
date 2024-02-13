package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.project.etities.Review;

public interface ReviewDao extends JpaRepository<Review, Integer>{

    @Query("SELECT avg(r.star) from Review r where r.product.id = :pid")
    Double getAverageStar(@Param("pid") int pid);
    
    Review save(Review review);
}