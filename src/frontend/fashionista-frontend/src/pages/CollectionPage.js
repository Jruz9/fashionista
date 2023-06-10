import { Grid} from "@mui/material";
import { collectionDataset } from "../sampledata/collectionsdataset";
import InfoCard from "../components/cards/InfoCard";

//Collection website for showing collections
function CollectionPage(){

    return(
        <div>
            <h1>Collections</h1>
            <hr></hr>
            <Grid container spacing={2} direction="row" jusify="flex-start" alignItems="flex">
                {
                    collectionDataset?.map(element =>(
                        <Grid item xs={12} sm={6} md={3} key={element.id}>
                            <InfoCard _arrayName={element.name}/>
                        </Grid>
                    ))  
                }
            </Grid>
        </div>
    )
}

export default CollectionPage;

