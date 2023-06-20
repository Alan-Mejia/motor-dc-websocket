package motordc.websocket.messages;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class DcMotorSystemInfo {
    private String from;
    private String to;
    private String action;
    private Float pinVoltageOutput;
    private Integer rpmWorking;
    private Integer maximumMotorRpm;
    private Double kp;
    private Double ki;
    private Double kd;

}
