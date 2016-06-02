package Optional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

/**
 * Created by qizhi on 2016/5/30.
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Country {

    Optional<PrimeMinister> primeMinister;


}
