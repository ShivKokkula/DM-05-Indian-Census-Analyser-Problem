package censusanalyser;

public class IndiaCensusDAO {
    public int population;
    public int densityPerSqKm;
    public int areaInSqKm;
    public String state;
    public String stateCode;

    public IndiaCensusDAO(IndiaCensusDAO indiaCensusDAO) {
        state = indiaCensusDAO.state;
        areaInSqKm = indiaCensusDAO.areaInSqKm;
        densityPerSqKm = indiaCensusDAO.densityPerSqKm;
        population = indiaCensusDAO.population;
    }
}
