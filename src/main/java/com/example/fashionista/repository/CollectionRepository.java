package com.example.fashionista.repository;

import com.example.fashionista.Entites.Collections;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CollectionRepository extends PagingAndSortingRepository<Collections,Long> {

    Collections findByCollectionName(String collectionName);

    Collections findByCollectionId(Long collectionId);


}
