package roomescape.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import roomescape.service.ReservationService;
import roomescape.view.ConsoleView;

@Component
public abstract class ReservationCommand extends Command{

    protected final ReservationService reservationService;

    @Autowired
    public ReservationCommand(ConsoleView consoleView, ReservationService reservationService) {
        super(consoleView);
        this.reservationService = reservationService;
    }
}
