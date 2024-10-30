package vn.iotstar.Service;

import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import vn.iotstar.Entity.CategoryEntity;

public interface ICategoryService {
	void deleteById(Long id);

	long count();

	Optional<CategoryEntity> findById(Long id);

	List<CategoryEntity> findAll();

	Page<CategoryEntity> findAll(Pageable pageable);

	List<CategoryEntity> findAll(Sort sort);

	<S extends CategoryEntity> S save(S entity);

	Page<CategoryEntity> findByNameContaining(String keyword, Pageable pageable);

	Optional<CategoryEntity> findByName(String name);

	List<CategoryEntity> findAllById(Iterable<Long> ids);

	void delete(CategoryEntity entity);

	void deleteAll();

	List<CategoryEntity> findByNameContaining(String name);
}
