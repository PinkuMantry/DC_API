package org.abc.repo;

import java.io.Serializable;

import org.abc.entity.DataCollection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataCollectionRepo extends JpaRepository<DataCollection, Serializable> {

}
