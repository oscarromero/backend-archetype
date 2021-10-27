package ${package}.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import org.immutables.value.Value;
import org.immutables.value.Value.Immutable;

@JsonDeserialize
@JsonSerialize
@Value.Style(
    allMandatoryParameters = true,
    deepImmutablesDetection = true,
    defaults = @Immutable(builder = false
)
)
public @interface ImmutableDto {
    
}
