import * as React from 'react';
// import { useForm } from 'react-hook-form';
// import { yupResolver } from '@hookform/resolvers/yup';
import Button from '@mui/material/Button';
import TextField from '@mui/material/TextField';
// import DialogActions from '@mui/material/DialogActions';
import DialogContent from '@mui/material/DialogContent';
import DialogTitle from '@mui/material/DialogTitle';
// import * as Yup from 'yup';
import { useState, useEffect } from 'react'
// import { Link, useParams, useNavigate } from 'react-router-dom'
import { Box, Container, FormControl, InputLabel, MenuItem } from '@mui/material';
import Select from '@mui/material/Select';
import { Grid} from "@mui/material";


/**
 * this component allows devlopers to add a dynamic form component for new looks.
 * @returns 
 */


function AddLookForm() {


    const[clothing,setClothingList]= useState([{clothingId:'',clothName:''}]);


    const handleAddClothing=()=>{
        const values=[...clothing];
        values.push({
            clothingId:'',
            clothName:'',
        });
        setClothingList(values)
    };


    const handleRemoveClothing =(index) =>{
        const values= [...clothing];
        values.splice(index,1);
        setClothingList(values);
    };

    const handleInputChange = (index,event) =>{
        const values= [...clothing];
        const updatedValue = event.target.clothName;
        values[index][updatedValue]=event.target.value;

        setClothingList(values)
    }

    console.log(clothing)



    return (
        <div>
            <Grid container spacing={3} direction="row" justify="flex-start" alignItems="flex-start">
            <DialogTitle sx={{ flexGrow: 1 }}>Create New Look</DialogTitle>
            <Button variant='contained' sx={{marginY:2, marginX:3}}>Save Look</Button>
            </Grid>
            {/* <Grid container spacing={3} direction="row" justify="flex-start" alignItems="flex-start">
                <Button variant='contained'>Save Look</Button>
            </Grid>
             */}

            <DialogContent>
                <TextField
                autoFocus
                margin='dense'
                id='lookName'
                label='Look Title'
                type='text'
                fullWidth
                variant='standard'
                />
            </DialogContent>

            <Container>
                {/* Solution found here: https://blog.bitsrc.io/how-to-create-dynamic-form-fields-in-react-45cc2cc7b1b0 */}
                {clothing.length >0 && (
                    <>
                    {clothing.map((field,index)=>(
                        <Box sx={{minWidth:120}}>
                        <FormControl fullWidth  >
                            <InputLabel>Clothing {index+1}</InputLabel>
                            <Select
                            onChange={(event)=> handleInputChange(index,event)}
                            >
                                <MenuItem value={field.clothName}>jacket</MenuItem>
                                <MenuItem>pants</MenuItem>
                                <MenuItem>shirt</MenuItem>
                            </Select>
                        </FormControl>
                        <Button color='error' onClick={() => handleRemoveClothing(index)}>Remove</Button>
                        </Box>
                    ))}
                    </>
                )}
            </Container>
            <Button variant='contained' onClick={() => handleAddClothing()}>Add Clothing</Button>



        </div>
        )
    


}

export default AddLookForm;