package th.mfu.mfu.Repository;
import th.mfu.mfu.domain.BookingData;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookingDataRepository extends JpaRepository<BookingData,Long> {
    List<BookingData> findByrefid(Long refid);
}
