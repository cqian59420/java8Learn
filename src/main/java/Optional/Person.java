package Optional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

/**
 * Created by qizhi on 2016/5/30.
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Person {
    Optional<Country> country;
}
