package com.delightkitchen.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data // @data = @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
@Entity
@Table(name = "bill")
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int billId;
	private float taxAndCharge;
	private float discount;
	private float billAmount;
	private float billTotal;
	private Date billDate;
	private String billPaymentMethod;
	private String billStatus;
	@OneToOne
	@JoinColumn(name = "billOrderId")
	private Orders billOrder;
	@ManyToOne
	@JoinColumn(name = "billCashierId")
	private Users billCashier;

}
