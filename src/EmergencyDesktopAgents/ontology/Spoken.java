package EmergencyDesktopAgents.ontology;

import jade.content.Predicate;

//#J2ME_EXCLUDE_FILE


@SuppressWarnings("serial")
public class Spoken implements Predicate {

	private String _what;

	public void setWhat(String what) {
		_what = what;
	}

	public String getWhat() {
		return _what;
	}

}