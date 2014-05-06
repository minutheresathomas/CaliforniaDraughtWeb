package sjsu.cmpe272;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sjsu.cmpe272.entity.Forecast;
import sjsu.cmpe272.entity.Reservoir;
import sjsu.cmpe272.svc.MongoSvc;

@RestController
public class MainController {

	@Autowired
	MongoSvc mongoSvc;

	/*
	 * @RequestMapping(value = "/reservoir", method = RequestMethod.GET)
	 * 
	 * @ResponseBody public Reservoir getReservoir(
	 * 
	 * @RequestParam(value = "reservoirId") String idFromHTTPRequest) { return
	 * mongoSvc.findReservoirById(idFromHTTPRequest); }
	 */

	@RequestMapping(value = "/reservoir/{reservoirId}", method = RequestMethod.GET)
	@ResponseBody
	public Reservoir getReservoirDoc(@PathVariable String reservoirId) {
		return mongoSvc.findReservoirDoc(reservoirId);
	}

	@RequestMapping(value = "/forecast/{reservoirId}", method = RequestMethod.GET)
	@ResponseBody
	public Forecast getForecast(@PathVariable String reservoirId) {
		return mongoSvc.findForecastById(reservoirId);
	}

}
