package com.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "image_data")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImageData {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name="name")
    private String name;
    
	@Column(name="image_type")
    private String type;
    
	@Lob
    @Column(name = "data",length = 1000)
    private byte[] imageData;
}