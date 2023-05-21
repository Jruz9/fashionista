import * as React from 'react';
import Card from '@mui/material/Card';
import CardContent from '@mui/material/CardContent';
import CardMedia from '@mui/material/CardMedia';
import Typography from '@mui/material/Typography';
import { CardActionArea } from '@mui/material';




function InfoCard({_arrayName}){


    return(
        <div>
            <Card sx={{maxwidth: 250}} >
                <CardActionArea>
                    <CardMedia component="img" height="140" image='' alt='' />
                    <CardContent>
                    <Typography gutterBottom variant='h5' component="div">{_arrayName}</Typography>
                    <Typography variant='body2' color="text.secondary"></Typography>
                    </CardContent>
                </CardActionArea>
            </Card>
        </div>
    )

}

export default InfoCard;