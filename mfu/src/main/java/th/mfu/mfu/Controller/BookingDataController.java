package th.mfu.mfu.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import th.mfu.mfu.domain.BookingData;
import th.mfu.mfu.Repository.BookingDataRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class BookingDataController {

    @Autowired
    private BookingDataRepository bookingDataRepository;

    // Get all bookings
    @GetMapping("/booking")
    public ResponseEntity<List<BookingData>> getAllBookings() {
        List<BookingData> bookings = bookingDataRepository.findAll();
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }

    // Get a booking by reference ID
    @GetMapping("/{refid}")
    public ResponseEntity<BookingData> getBookingByRefId(@PathVariable Long refid) {
        Optional<BookingData> bookingData = bookingDataRepository.findById(refid);
        if (bookingData.isPresent()) {
            return new ResponseEntity<>(bookingData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Create a new booking
    @PostMapping("/booking")
    public ResponseEntity<BookingData> createBooking(@RequestBody BookingData bookingData) {
        //if (bookingData.getDatereq() == null) {
         //   return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       // }

        BookingData savedBooking = bookingDataRepository.save(bookingData);
        return new ResponseEntity<>(savedBooking, HttpStatus.CREATED);
    }

    // Update an existing booking
    @PutMapping("/booking/{refid}")
    public ResponseEntity<BookingData> updateBooking(@PathVariable Long refid, @RequestBody BookingData updatedBookingData) {
        if (!bookingDataRepository.existsById(refid)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        updatedBookingData.setRefid(refid);
        BookingData savedBooking = bookingDataRepository.save(updatedBookingData);
        return new ResponseEntity<>(savedBooking, HttpStatus.OK);
    }

    // Delete a booking
    @DeleteMapping("/booking/{refid}")
    public ResponseEntity<Void> deleteBooking(@PathVariable Long refid) {
        if (!bookingDataRepository.existsById(refid)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        bookingDataRepository.deleteById(refid);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Example of finding bookings by user reference ID
    @GetMapping("/user/{refid}")
    public ResponseEntity<List<BookingData>> getBookingsByUserId(@PathVariable Long refid) {
        List<BookingData> bookings = bookingDataRepository.findByrefid(refid);
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }
}
