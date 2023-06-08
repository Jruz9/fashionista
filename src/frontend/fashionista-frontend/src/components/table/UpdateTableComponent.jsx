import * as React from 'react';
import { styled } from '@mui/material/styles';
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell, { tableCellClasses } from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';
import { Button, DialogContent } from "@mui/material";
import { looksDataset } from '../../sampledata/looksdataset';
import { useState } from 'react';
import Dialog from '@mui/material/Dialog';


const StyledTableCell = styled(TableCell)(({ theme }) => ({
  [`&.${tableCellClasses.head}`]: {
    backgroundColor: theme.palette.common.black,
    color: theme.palette.common.white,
  },
  [`&.${tableCellClasses.body}`]: {
    fontSize: 14,
  },
}));

const StyledTableRow = styled(TableRow)(({ theme }) => ({
  '&:nth-of-type(odd)': {
    backgroundColor: theme.palette.action.hover,
  },
  // hide last border
  '&:last-child td, &:last-child th': {
    border: 0,
  },
}));

/**
 * A generic table that allows you to display names and operations with a dialog form.
 * @param {*} dataTable :A Array paramater that allows you to enter your data as a array.
 * @returns A table component with the data from your array shown.
 */

export default function UpdateTableComponent({dataTable, columnOneName, operationOne, operationTwo}) {
  const [arrayList,SetList] = useState([]);
  const[open,setOpen]=useState(false)

  const handleClose= () =>{
    setOpen(false)

}
const handleClickOpen =() =>{
    setOpen(true)
} 
  
  return (


    <div>
      <Button variant="contained" onClick={handleClickOpen}>Update</Button>
      <Dialog open={open} onClose={handleClose}>
        <DialogContent>
          <TableContainer component={Paper}>
            <Table sx={{ minWidth: 300 }} aria-label="customized table">
              <TableHead>
                <TableRow>
                  <StyledTableCell>{columnOneName}</StyledTableCell>
                  <StyledTableCell align="center">Options</StyledTableCell>
                </TableRow>
              </TableHead>
              <TableBody>
                {looksDataset.map(
                  row =>
                    <StyledTableRow key={row.id}>
                      <StyledTableCell >{row.name}</StyledTableCell>
                      <StyledTableCell>
                        <Button>Update</Button>
                        <Button>Delete</Button>
                      </StyledTableCell>
                    </StyledTableRow>
                  
                )}
              </TableBody>
            </Table>
          </TableContainer>
        </DialogContent>
      </Dialog>
    </div>

  );
}