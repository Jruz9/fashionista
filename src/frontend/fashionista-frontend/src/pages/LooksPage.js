import { Grid} from "@mui/material";
import { looksDataset } from "../sampledata/looksdataset";
import InfoCard from "../components/cards/InfoCard";



function LooksPage(){
    


    return(
        <div>
            <hr></hr>
            {/* solution found here: https://stackoverflow.com/questions/51595156/three-cards-in-a-row-instead-of-all-cards-in-one-column?answertab=modifieddesc#tab-top */}
            <Grid container spacing={2} direction="row" justify="flex-start" alignItems="flex-start">
            {
                looksDataset?.map(element =>(
                    <Grid item xs={12} sm={6} md={3} key={element.id}>
                        <InfoCard _arrayName= {element.name} />
                    </Grid>
                ))
            }
            </Grid>
        </div>
    )
}

export default LooksPage;