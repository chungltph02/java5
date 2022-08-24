package java5.sof2021.configuration;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Modelmapper {
@Bean
public ModelMapper getModelmapper() {
	ModelMapper mapper=new ModelMapper();
	mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STANDARD);
	return mapper;
}
}
