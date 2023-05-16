import * as React from 'react';
import { useState } from 'react';
import Button from '@mui/material/Button';
import TextField from '@mui/material/TextField';
import Dialog from '@mui/material/Dialog';
import DialogActions from '@mui/material/DialogActions';
import DialogContent from '@mui/material/DialogContent';
import DialogTitle from '@mui/material/DialogTitle';

import ClothServices from '../../services/ClothServices';
/**
 * This component is a modal that allows users to enter clothes information
 * @returns 
 */
function CreateCloth(){

    //clothes useEffects
    const [name, setName] = useState('')
    const [color, setColor] = useState('')
    const [material, setMaterial] = useState('')
    const [size, setSize] = useState('')

    const cloth={name,color,material,size}
    const [open,setOpen]=React.useState(false)


    const handleClickOpen= ()=>{
        setOpen(true)
    }
    const handleClose=() =>{
        setOpen(false)
    }

    const onSubmit=(e) =>{
        ClothServices.createClothes(e).then((response)=>{
            console.log(response.data)
        }).catch(error =>{
            console.log(error)
        })
        setOpen(false);
    }

    return (
        <div>
            <Button variant='contained' onClick={handleClickOpen}>Add clothes </Button>
            <Dialog open={open} onClose={handleClose}>
                <DialogTitle>Add cloth</DialogTitle>
                <DialogContent>
                    <TextField
                    autoFocus
                    margin="dense"
                    id="name"
                    label="cloth name"
                    type="text"
                    fullWidth
                    variant='standard'
                    onChange={(textInput)=>{
                        setName(textInput.target.value)
                    }}
                    />
                    <TextField
                    autoFocus
                    margin="dense"
                    id="color"
                    label="Color"
                    type="text"
                    fullWidth
                    variant='standard'
                    onChange={(textInput)=>{
                        setColor(textInput.target.value)
                    }}
                    />
                    <TextField
                    autoFocus
                    margin="dense"
                    id="material"
                    label="material type"
                    type="text"
                    fullWidth
                    variant='standard'
                    onChange={(textInput)=>{
                        setMaterial(textInput.target.value)
                    }}
                    />
                    <TextField
                    autoFocus
                    margin="dense"
                    id="size"
                    label="cloth size"
                    type="text"
                    fullWidth
                    variant='standard'
                    onChange={(textInput)=>{
                        setSize(textInput.target.value)
                    }}
                    />
                </DialogContent>
                <DialogActions>
                <Button onClick={handleClose}>Cancel</Button>
                <Button onClick={onSubmit(cloth)}>Create</Button>
                </DialogActions>
            </Dialog>
        </div>
    )
}
export default CreateCloth;