package spring_0708;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepositoryInterface extends JpaRepository<User, Long> {

  User findByIdAndAddress(Long id, String address);
}
