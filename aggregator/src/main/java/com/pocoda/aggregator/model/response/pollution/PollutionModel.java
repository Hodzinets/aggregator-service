package com.pocoda.aggregator.model.response.pollution;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PollutionModel {
	private PollutionType type;
	private Double value;
	private Double percentage;
}
