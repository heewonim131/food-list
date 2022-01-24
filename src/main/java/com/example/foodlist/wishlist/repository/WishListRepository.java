package com.example.foodlist.wishlist.repository;

import com.example.foodlist.db.MemoryDbRepository;
import com.example.foodlist.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepository<WishListEntity> {
}