public class Lasagna {

    private final int timeRequiredInOven = 40; //Defines the actual time required for the lasagna to be in the oven in mins.
    private final int timeRequiredPerLayer = 2; //Defines time required to prepare each layer in minutes.


    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){

        return this.timeRequiredInOven;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int currentTimeInOven){

        return (this.timeRequiredInOven - currentTimeInOven);

    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers){

        return (numberOfLayers * this.timeRequiredPerLayer);

    }

    // TODO: define the 'totalTimeInMinutes()' method

    public int totalTimeInMinutes(int numberOfLayers, int currentTimeInOven){

        return (currentTimeInOven + this.preparationTimeInMinutes(numberOfLayers));
    }
}
