package org.matsim.analysis;

import org.matsim.core.api.experimental.events.EventsManager;
import org.matsim.core.events.EventsUtils;

public class RunLinkAnalysis {

    public static void main(String[] args){
        EventsManager manager = EventsUtils.createEventsManager();
        LinkEventsHandler handler = new LinkEventsHandler();

        manager.addHandler(handler);

        EventsUtils.readEvents(manager, "C:\\Users\\paulh\\git\\Uni\\MatSim\\matsim-serengeti-park-hodenhagen\\scenarios\\serengeti-park-v1.0\\output\\output-serengeti-park-v1.0-run1\\serengeti-park-v1.0-run1.output_events.xml.gz");

        handler.printHistogram();

    }
}