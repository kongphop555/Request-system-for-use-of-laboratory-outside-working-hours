package th.mfu.mfu.Repository;
import th.mfu.mfu.domain.Users;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {
    List<Users> findAll();
}