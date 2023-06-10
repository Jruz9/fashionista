
// A function where users can view all the clothes in their looks using the info card layout.

import InfoCard from "../cards/InfoCard"
import { Grid } from "@mui/material"
import {clothingDataset} from "../../sampledata/clothingdataset"



export default function AllClothesInLookView(){

//need to create a way for the url show the id of the looks and find the cloth array with the backend.
    return(
        <div>
            <hr></hr>
                <Grid  container spacing={2} direction={2} jusify="flex-start">
                    {
                    clothingDataset?.map(element =>(
                        <Grid item xs={12} sm={6} md={3} key={element.clothId}>
                            <InfoCard _arrayName= {element.name} />
                        </Grid>
                    )) 
                    }
                </Grid>
            
        </div>
    )
}