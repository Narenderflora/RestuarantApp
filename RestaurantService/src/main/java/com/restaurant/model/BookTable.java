package com.restaurant.model;

import java.time.LocalDate;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookTable {
	private String bookingId;

	@NotNull(message = "Provide value for customer name")
	private String customerName;

	private String mobileNumber;

	private Integer totalGuestCount;

	@DecimalMin(value = "0", inclusive = true, message = "Provide value greater than or equal to zero")
	private Integer totalAdultVegCount;

	@DecimalMin(value = "0", inclusive = true, message = "Provide value greater than or equal to zero")
	private Integer totalAdultNonVegCount;

	@DecimalMin(value = "0", inclusive = true, message = "Provide value greater than or equal to zero")
	private Integer totalKidsVegCount;

	@DecimalMin(value = "0", inclusive = true, message = "Provide value greater than or equal to zero")
	private Integer totalKidsNonVegCount;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate bookingDate;
	private Double totalBillAmount;

	public BookTable(String bookingId, String customerName, String mobileNumber, Integer totalGuestCount,
			Integer totalAdultVegCount, Integer totalAdultNonVegCount, Integer totalKidsVegCount,
			Integer totalKidsNonVegCount, LocalDate bookingDate, Double totalBillAmount) {
		super();
		this.bookingId = bookingId;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.totalGuestCount = totalGuestCount;
		this.totalAdultVegCount = totalAdultVegCount;
		this.totalAdultNonVegCount = totalAdultNonVegCount;
		this.totalKidsVegCount = totalKidsVegCount;
		this.totalKidsNonVegCount = totalKidsNonVegCount;
		this.bookingDate = bookingDate;
		this.totalBillAmount = totalBillAmount;
	}

	public BookTable() {

	}

}
